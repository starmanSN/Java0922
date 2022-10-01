CREATE TABLE FILM
(
    ID       BIGSERIAL    NOT NULL PRIMARY KEY,
    NAME     VARCHAR(255) NOT NULL,
    DURATION FLOAT        NOT NULL,

    UNIQUE (NAME)
);

CREATE TABLE student
(
    id   BIGSERIAL    NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    mark FLOAT        NOT NULL
);

insert into student(name, mark)  values ('Ivan', 5.0);

CREATE TABLE WEEKDAYS_PRICE
(
    ID            BIGSERIAL NOT NULL PRIMARY KEY,
    PRICE         BIGINT    NOT NULL,
    FILM_DURATION FLOAT     NOT NULL,

    UNIQUE (ID),

    CONSTRAINT FK_SCHEDULE
        FOREIGN KEY (ID)
            REFERENCES SCHEDULE (ID)
);

CREATE TABLE WEEKEND_PRICE
(
    ID            BIGSERIAL NOT NULL PRIMARY KEY,
    PRICE         BIGINT    NOT NULL,
    FILM_DURATION FLOAT     NOT NULL,

    UNIQUE (ID),

    CONSTRAINT FK_SCHEDULE
        FOREIGN KEY (ID)
            REFERENCES SCHEDULE (ID)
);

CREATE TABLE SCHEDULE
(
    ID         BIGSERIAL    NOT NULL PRIMARY KEY,
    FILM_NAME  VARCHAR(255) NOT NULL,
    PRICE      BIGINT       NOT NULL,
    START_TIME VARCHAR(255) NOT NULL,

    CONSTRAINT FK_FILM
        FOREIGN KEY (FILM_NAME)
            REFERENCES FILM (NAME)
);

CREATE TABLE TICKETS
(
    ID            BIGSERIAL NOT NULL PRIMARY KEY,
    TICKET_NUMBER BIGINT    NOT NULL,
    SCHEDULE_ID   BIGINT,

    UNIQUE (TICKET_NUMBER),

    CONSTRAINT FK_TICKET
        FOREIGN KEY (SCHEDULE_ID)
            REFERENCES SCHEDULE (ID)

);

insert into film(name, duration)
values ('film1', 60);
insert into film(name, duration)
values ('film2', 90);
insert into film(name, duration)
values ('film3', 120);

insert into weekdays_price(price, film_duration)
values (100, 60);
insert into weekdays_price(price, film_duration)
values (150, 90);
insert into weekdays_price(price, film_duration)
values (180, 120);
insert into weekdays_price(price, film_duration)
values (150, 60);
insert into weekdays_price(price, film_duration)
values (200, 90);
insert into weekdays_price(price, film_duration)
values (250, 120);

insert into weekend_price(price, film_duration)
values (200, 60);
insert into weekend_price(price, film_duration)
values (250, 90);
insert into weekend_price(price, film_duration)
values (300, 120);
insert into weekend_price(price, film_duration)
values (300, 60);
insert into weekend_price(price, film_duration)
values (400, 90);
insert into weekend_price(price, film_duration)
values (500, 120);

insert into schedule(film_name, price, start_time)
values ('film1', 100, 20.10);
insert into schedule(film_name, price, start_time)
values ('film2', 150, 20.30);
insert into schedule(film_name, price, start_time)
values ('film3', 180, 21.00);

insert into tickets(ticket_number, schedule_id)
VALUES (7656567, 1);
insert into tickets(ticket_number, schedule_id)
VALUES (3453672, 2);
insert into tickets(ticket_number, schedule_id)
VALUES (324567876, 3);
insert into tickets(ticket_number, schedule_id)
VALUES (1234687345, 4);
insert into tickets(ticket_number, schedule_id)
VALUES (4534534134, 5);
insert into tickets(ticket_number, schedule_id)
VALUES (7856779, 6);
insert into tickets(ticket_number, schedule_id)
VALUES (75675678, 7);
insert into tickets(ticket_number, schedule_id)
VALUES (78646, 8);
insert into tickets(ticket_number, schedule_id)
VALUES (6875367, 9);
insert into tickets(ticket_number, schedule_id)
VALUES (96796006, 10);
insert into tickets(ticket_number, schedule_id)
VALUES (00875678, 11);
insert into tickets(ticket_number, schedule_id)
VALUES (767590, 12);
insert into tickets(ticket_number, schedule_id)
VALUES (56790, 13);
insert into tickets(ticket_number, schedule_id)
VALUES (45689, 14);
insert into tickets(ticket_number, schedule_id)
VALUES (546789, 15);
insert into tickets(ticket_number, schedule_id)
VALUES (64534, 16);
insert into tickets(ticket_number, schedule_id)
VALUES (467347, 17);
insert into tickets(ticket_number, schedule_id)
VALUES (324672, 18);
insert into tickets(ticket_number, schedule_id)
VALUES (21134347, 19);
insert into tickets(ticket_number, schedule_id)
VALUES (453678, 20);
insert into tickets(ticket_number, schedule_id)
VALUES (457894, 21);


