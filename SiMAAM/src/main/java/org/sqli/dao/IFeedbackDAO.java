package org.sqli.dao;

import org.sqli.entities.Feedback;
import java.util.List;

public interface IFeedbackDAO {
   public void addFeedback();
   public List<Feedback> listFeedbacks(Long id);

}
