CREATE TABLE EMPLEADO 
(
  ID NUMBER(*, 0) NOT NULL 
, NOMBRE VARCHAR2(20 BYTE) 
, APELLIDO VARCHAR2(20 BYTE) 
, IDDEP NUMBER(*, 0) 
, CONSTRAINT EMPLEADO_PK PRIMARY KEY 
  (
    ID 
  )
  USING INDEX 
  (
      CREATE UNIQUE INDEX EMPLEADO_PK ON EMPLEADO (ID ASC) 
      LOGGING 
      TABLESPACE USERS 
      PCTFREE 10 
      INITRANS 2 
      STORAGE 
      ( 
        INITIAL 65536 
        NEXT 1048576 
        MINEXTENTS 1 
        MAXEXTENTS UNLIMITED 
        BUFFER_POOL DEFAULT 
      ) 
      NOPARALLEL 
  )
  ENABLE 
) 
LOGGING 
TABLESPACE USERS 
PCTFREE 10 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS UNLIMITED 
  BUFFER_POOL DEFAULT 
) 
NOPARALLEL;

ALTER TABLE EMPLEADO
ADD CONSTRAINT EMPLEADO_FK1 FOREIGN KEY
(
  ID 
)
REFERENCES DEPARTAMENTO
(
  ID 
)
ENABLE;
