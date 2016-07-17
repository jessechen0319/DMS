CREATE TABLE public."testBean"
(
  name text,
  age integer,
  id integer NOT NULL,
  CONSTRAINT "TestBean_pkey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."testBean"
  OWNER TO postgres;

CREATE SEQUENCE serial START 101;