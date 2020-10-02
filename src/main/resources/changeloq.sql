create table SWEATMESSAGE
(
	ID NUMBER generated as identity,
	TEXT VARCHAR2(255),
	TAG VARCHAR2(255)
)
/

create unique index SWEATMESSAGE_ID_UINDEX
	on SWEATMESSAGE (ID)
/

-----------------------------------------------------


create table DOT_MESSAGE
(
    ID NUMBER(10),
    TEXT VARCHAR2(255),
    TAG VARCHAR2(255)
)
/

create sequence S_DOT_MESSAGE_SEQ
    start with 1000
       increment by 1
/

create unique index DOT_MESSAGE_ID_UINDEX
    on DOT_MESSAGE (ID)
/

alter table DOT_MESSAGE
    add constraint DOT_MESSAGE_PK
        primary key (ID)
/