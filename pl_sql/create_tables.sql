--Empleado TABLE
CREATE TABLE "EMPLEADO" 
   ("ID_EMPLEADO" NUMBER(11,0) NOT NULL , 
    "EMP_APELLIDO1" VARCHAR2(15 BYTE) NOT NULL , 
    "EMP_APELLIDO2" VARCHAR2(15 BYTE), 
    "EMP_NOMBRE" VARCHAR2(30 BYTE) NOT NULL) 
/
ALTER TABLE EMPLEADO_a ADD (CONSTRAINT EMPLEADO_A_PK
  PRIMARY KEY(ID_EMPLEADO)
    --USING INDEX 
    --TABLESPACE ^datind
    --STORAGE (INITIAL 64 k)
  )
/
COMMENT ON TABLE EMPLEADO IS 'Empleados.'
/
COMMENT ON COLUMN EMPLEADO.ID_EMPLEADO IS 'Identificador del empleado.'
/
COMMENT ON COLUMN EMPLEADO.EMP_APELLIDO1 IS 'Apellido 1 del empleado.'
/
COMMENT ON COLUMN EMPLEADO.EMP_APELLIDO2 IS 'Apellido 2 del empleado.'
/
COMMENT ON COLUMN EMPLEADO.EMP_NOMBRE IS 'Nombres del empleado.'
/

--VENTAS TABLE
CREATE TABLE "VENTAS" 
   ("ID_VENTA" NUMBER(11) NOT NULL , 
    "ID_EMPLEADO" NUMBER(11,0)  NOT NULL , 
   	"DESCRIPCION_VENTA" VARCHAR2(200 BYTE), 
   	"VALOR_VENTA" NUMBER NOT NULL) 
/
 ALTER TABLE VENTAS ADD (CONSTRAINT VENTAS_PK PRIMARY KEY(ID_VENTA), 
 CONSTRAINT VENTAS_FK01  FOREIGN KEY (ID_EMPLEADO) REFERENCES EMPLEADO(ID_EMPLEADO))
/ 

COMMENT ON TABLE VENTAS IS 'Ventas por empleado .'
/
COMMENT ON COLUMN VENTAS.ID_VENTA IS 'Consecutivo de la venta.'
/
COMMENT ON COLUMN VENTAS.ID_EMPLEADO IS 'Id del empleado.'
/
COMMENT ON COLUMN VENTAS.DESCRIPCION_VENTA IS 'Descripcion de la venta.'
/
COMMENT ON COLUMN VENTAS.VALOR_VENTA IS 'Valor de la venta.'
/

