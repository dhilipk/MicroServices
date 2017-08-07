package com.mytrip.customer.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.common.flight.vo.FlightScheduleVo;
import com.mytrip.customer.notification.producer.KafkaMessageProducer;

@RestController
public class CustomerNotificationByMq {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;

    @RequestMapping(path = "v1/notify/customer", method = RequestMethod.POST)
    public void sendNotification(FlightScheduleVo flightScheduleVo) {
        String message = "MyTrip is delighted to confirm your booking. Your PNR is " 
    + flightScheduleVo.getPnr() + "for your flight " + flightScheduleVo.getFlightNumber() +
    " departing on " + flightScheduleVo.getDateOfTravel();
        kafkaMessageProducer.send("myTopic", message);
    }
}
