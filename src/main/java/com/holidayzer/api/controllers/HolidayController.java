package com.holidayzer.api.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.api.models.Holidays;

@RestController
@RequestMapping("/holidays")
public class HolidayController {
  @GetMapping
  public Map<String, String> getAllHolidays() {
    return Holidays.getAllHolidays();
  }

  @GetMapping("/{date}")
  public String getHolidayByDate(@PathVariable("date") String date) {
    return Holidays.getHolidayByDate(date);
  }
}
