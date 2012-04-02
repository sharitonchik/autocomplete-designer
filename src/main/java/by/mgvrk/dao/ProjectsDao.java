package by.mgvrk.dao;

import by.mgvrk.entity.user.Project;
import by.mgvrk.entity.user.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class ProjectsDao extends Dao {

    public ProjectsDao(Session session) {
        super(session);
    }

    public void setProject(String projectName, User user) throws HibernateException {
        Project project = new Project();
        project.setProjectName(projectName);
        user.getProjects().add(project);
        session.save(user);
    }
}
