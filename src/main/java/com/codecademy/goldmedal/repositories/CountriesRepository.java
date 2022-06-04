package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.CountryDetailsResponse;
import org.springframework.data.repository.CrudRepository;

import com.codecademy.goldmedal.model.Country;

import java.util.List;
import java.util.Optional;

//creating an extension of the CrudRepo to manage the Country model
public interface CountriesRepository extends CrudRepository<Country, Integer> {

    public Optional<Country> getByName(String countryName);
    //public Optional<Country> findCountriesByEvent()

    public List<Country> getCountriesByOrderByNameAsc();

    public List<Country> getCountriesByOrderByNameDesc();

    public List<Country> getCountriesByOrderByGdpAsc();

    public List<Country> getCountriesByOrderByGdpDesc();

    public List<Country> getCountriesByOrderByPopulationAsc();

    public List<Country> getCountriesByOrderByPopulationDesc();

    public List<Country> getAllBy();

}
