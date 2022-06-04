package com.codecademy.goldmedal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.GoldMedal;

import java.util.List;

//creating an extension of the CrudRepo to manage the GoldMedal model
public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
//inherits methods
    public Integer countBySeason(String season);

    public Integer countByCountry(String country);

    public List<GoldMedal> getGoldMedalsByCountryAndSeasonOrderByYearAsc(String country, String season);

    public Integer countByGender(String gender);

    public List<GoldMedal> getGoldMedalsByCountryOrderByYearAsc(String countryName);
    public List<GoldMedal> getGoldMedalsByCountryOrderByYearDesc(String countryName);
    public List<GoldMedal> getGoldMedalsByCountryOrderBySeasonAsc(String country);
    public List<GoldMedal> getGoldMedalsByCountryOrderBySeasonDesc(String country);
    public List<GoldMedal> getGoldMedalsByCountryOrderByCityAsc(String countryName);
    public List<GoldMedal> getGoldMedalsByCountryOrderByCityDesc( String countryName);
    List<GoldMedal> getGoldMedalsByCountryOrderByNameDesc(String countryName);
    List<GoldMedal> getGoldMedalsByCountryOrderByNameAsc(String countryName);
    List<GoldMedal> getGoldMedalsByCountryOrderByEventAsc(String countryName);
    List<GoldMedal> getGoldMedalsByCountryOrderByEventDesc(String countryName);
}
