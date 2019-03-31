package ro.utcn.sd.vba.a1.repository.api;

import ro.utcn.sd.vba.a1.model.Question;
import ro.utcn.sd.vba.a1.model.VoteQuestion;

import java.sql.SQLException;

public interface VoteQuestionRepository {
    VoteQuestion save(VoteQuestion voteQuestion) throws SQLException;

    void remove(VoteQuestion voteQuestion) throws SQLException;

    int voteCount(Question question);
}