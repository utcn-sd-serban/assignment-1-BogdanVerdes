package ro.utcn.sd.vba.a1.repository.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import ro.utcn.sd.vba.a1.repository.api.*;
import ro.utcn.sd.vba.a1.repository.memory.*;

@Component
@RequiredArgsConstructor
@ConditionalOnProperty (name = "a1.repository-type",havingValue = "JDBC")
public class JdbcRepositoryFactory implements RepositoryFactory{
    private final InMemoryQuestionRepository questionRepository = new InMemoryQuestionRepository();
    private final InMemoryAnswerRepository answerRepository = new InMemoryAnswerRepository();
    private final InMemoryUserRepository userRepository = new InMemoryUserRepository();
    private final InMemoryTagRepository tagRepository = new InMemoryTagRepository();
    private final InMemoryQuestionTagRepository questionTagRepository = new InMemoryQuestionTagRepository();

    @Override
    public QuestionRepository createQuestionRepository() {
        return questionRepository;
    }

    @Override
    public AnswerRepository createAnswerRepository() {
        return answerRepository;
    }

    @Override
    public UserRepository createUserRepository() {
        return userRepository;
    }

    @Override
    public TagRepository createTagRepository() {
        return tagRepository;
    }

    @Override
    public QuestionTagRepository createQuestionTagRepository() {
        return questionTagRepository;
    }

}
