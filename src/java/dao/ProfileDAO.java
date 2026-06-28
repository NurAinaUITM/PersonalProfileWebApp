package dao;

import bean.ProfileBean;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfileDAO {

    // Save Profile
    public boolean saveProfile(ProfileBean profile) {

        boolean success = false;

        String sql = "INSERT INTO profiles "
                + "(name, studentId, programme, email, hobbies, introduction) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, profile.getName());
            ps.setString(2, profile.getStudentId());
            ps.setString(3, profile.getProgramme());
            ps.setString(4, profile.getEmail());
            ps.setString(5, profile.getHobbies());
            ps.setString(6, profile.getIntroduction());

            success = ps.executeUpdate() > 0;

            ps.close();
            conn.close();

        } catch (SQLException e) {
    System.out.println("SQL Error: " + e.getMessage());
    e.printStackTrace();
}

        return success;
    }

    // View All Profiles
    public List<ProfileBean> getAllProfiles() {

        List<ProfileBean> list = new ArrayList<>();

        String sql = "SELECT * FROM profiles";

        try {

            Connection conn = DBConnection.getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                ProfileBean profile = new ProfileBean();

                profile.setId(rs.getInt("id"));
                profile.setName(rs.getString("name"));
                profile.setStudentId(rs.getString("studentId"));
                profile.setProgramme(rs.getString("programme"));
                profile.setEmail(rs.getString("email"));
                profile.setHobbies(rs.getString("hobbies"));
                profile.setIntroduction(rs.getString("introduction"));

                list.add(profile);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // Search by Student ID
    public ProfileBean searchProfile(String studentId) {

        ProfileBean profile = null;

        String sql = "SELECT * FROM profiles WHERE studentId=?";

        try {

            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                profile = new ProfileBean();

                profile.setId(rs.getInt("id"));
                profile.setName(rs.getString("name"));
                profile.setStudentId(rs.getString("studentId"));
                profile.setProgramme(rs.getString("programme"));
                profile.setEmail(rs.getString("email"));
                profile.setHobbies(rs.getString("hobbies"));
                profile.setIntroduction(rs.getString("introduction"));
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return profile;
    }
}