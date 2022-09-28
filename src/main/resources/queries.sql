/*(1)*/
select film_name, start_time, duration
from schedule
         join film f on f.name = schedule.film_name
order by start_time;

/*(2)*/
select film_name, count(schedule_id)
from tickets
         left join schedule s on s.id = tickets.schedule_id
group by film_name
order by film_name;

/*(3)*/
select film_name, sum(price) as amount
from tickets
         join schedule s on s.id = tickets.schedule_id
group by film_name
order by amount desc;

/*(4)*/
select start_time           as time,
       count(ticket_number) as number_of_spectators,
       sum(price)           as box_office
from schedule
         join tickets t on schedule.id = t.schedule_id
group by start_time
having start_time < '12'
order by start_time;

/*(5)*/
select start_time           as time,
       count(ticket_number) as number_of_spectators,
       sum(price)           as box_office
from schedule
         join tickets t on schedule.id = t.schedule_id
group by start_time
having start_time >= '12'
   and start_time < '15'
order by start_time;

/*(6)*/
select start_time           as time,
       count(ticket_number) as number_of_spectators,
       sum(price)           as box_office
from schedule
         join tickets t on schedule.id = t.schedule_id
group by start_time
having start_time >= '15'
   and start_time < '18'
order by start_time;

/*(7)*/
select start_time           as time,
       count(ticket_number) as number_of_spectators,
       sum(price)           as box_office
from schedule
         join tickets t on schedule.id = t.schedule_id
group by start_time
having start_time >= '18'
   and start_time < '21'
order by start_time;

/*(8)*/
select start_time           as time,
       count(ticket_number) as number_of_spectators,
       sum(price)           as box_office
from schedule
         join tickets t on schedule.id = t.schedule_id
group by start_time
having start_time >= '21'
   and start_time < '23.59'
order by start_time;
