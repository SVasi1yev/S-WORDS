package ru.svasilyev.swords.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public enum TestDTO {
    ;

    public interface Id {
        Long getId();
    }

    public interface Name {
        String getName();
    }

    public interface Description {
        String getDescription();
    }

    public enum Response {
        ;

        @Entity
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Read implements Id, Name, Description {
            @jakarta.persistence.Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private Long id;
            private String name;
            private String description;
        }
    }
}
