package com.holidayzer.api.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Holidays {
  private static final Map<LocalDate, String> holidays = new LinkedHashMap<>();
  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

  public static final void init() {
    holidays.put(LocalDate.of(2024, 1, 01), "Confraternização Mundial");
    holidays.put(LocalDate.of(2024, 2, 12), "Carnaval");
    holidays.put(LocalDate.of(2024, 2, 13), "Carnaval");
    holidays.put(LocalDate.of(2024, 3, 29), "Sexta-feira Santa");
    holidays.put(LocalDate.of(2024, 4, 21), "Tiradentes");
    holidays.put(LocalDate.of(2024, 5, 01), "Dia do Trabalho");
    holidays.put(LocalDate.of(2024, 5, 30), "Corpus Christi");
    holidays.put(LocalDate.of(2024, 9, 07), "Corpus Christi");
    holidays.put(LocalDate.of(2024, 9, 07), "Independência do Brasil");
    holidays.put(LocalDate.of(2024, 10, 12), "Nossa Senhora Aparecida");
    holidays.put(LocalDate.of(2024, 11, 02), "Finados");
    holidays.put(LocalDate.of(2024, 11, 15), "Proclamação da República");
    holidays.put(LocalDate.of(2024, 11, 20), "Dia Nacional de Zumbi e da Consciência Negra");
    holidays.put(LocalDate.of(2024, 12, 25), "Natal");
  }

  public static final String getFormattedDate(LocalDate date) {
    return date.format(Holidays.formatter);
  }

  public static final Map<String, String> getAllHolidays() {
    if (holidays.isEmpty()) {
      Holidays.init();
    }
    Map<String, String> formattedHolidays = new LinkedHashMap<>();

    for (LocalDate holidayDate : holidays.keySet()) {
      formattedHolidays.put(getFormattedDate(holidayDate), holidays.get(holidayDate));
    }
    return formattedHolidays;
  }

  public static String getHolidayByDate(String date) {
    if (holidays.isEmpty()) {
      Holidays.init();
    }

    LocalDate parsedDate;
    try {
      parsedDate = LocalDate.parse(date, formatter);
    } catch (DateTimeParseException e) {
      return "Date " + date + " is not valid!";
    }
    if (parsedDate.getYear() != 2024) {
      return "This API only supports 2024 year!";
    }
    String holiday = holidays.get(parsedDate);

    if (holiday != null) {
      return "Dia " + date + " é " + holiday + "! 🎉";
    } else {
      return "Dia " + date + " não é feriado 🥲";
    }
  }
}
