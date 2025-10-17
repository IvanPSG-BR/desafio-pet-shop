package io.ivanpsg.petshop_system.Repository;

import io.ivanpsg.petshop_system.Model.Pet;
import io.ivanpsg.petshop_system.Model.SearchFilter;

public interface IDataAccess {
    void save(Pet pet);
    void findBy(SearchFilter filter);
    void findByTwoFilters(SearchFilter filter, SearchFilter secondFilter);
    void edit(Integer number);
    void delete(Integer number);
}
