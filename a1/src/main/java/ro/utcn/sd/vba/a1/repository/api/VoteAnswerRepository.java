package ro.utcn.sd.vba.a1.repository.api;

import ro.utcn.sd.vba.a1.model.Answer;
import ro.utcn.sd.vba.a1.model.VoteAnswer;

import java.sql.SQLException;

public interface VoteAnswerRepository {
    VoteAnswer save(VoteAnswer voteAnswer) throws SQLException;

    void remove(VoteAnswer voteAnswer) throws SQLException;

    int voteCount(Answer answer);
}
