package ru.svasilyev.swords.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.svasilyev.swords.models.TestEntity;
import ru.svasilyev.swords.respositories.TestRepository;

import java.util.List;

@Service
public class TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<TestEntity> getTest() {
        return testRepository.findAll();
    }

    public TestEntity saveTest(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

    public void deleteTest(long id) {
        testRepository.deleteById(id);
    }
}
