package ru.svasilyev.swords.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.svasilyev.swords.models.TestEntity;

@Repository
public interface TestRepository
        extends JpaRepository<TestEntity, Long> {
}
