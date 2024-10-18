CREATE IF NOT EXISTS SCHEMA test_schema;

CREATE IF NOT EXISTS TABLE test_schema.test_table (
	id int8 NOT NULL,
	name varchar(255) NULL,
	description varchar(255) NULL,
	CONSTRAINT test_table_pk PRIMARY KEY (id)
);