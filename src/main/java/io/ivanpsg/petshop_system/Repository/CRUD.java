package io.ivanpsg.petshop_system.Repository;

import io.ivanpsg.petshop_system.Model.Pet;
import io.ivanpsg.petshop_system.Model.SearchFilter;

public class CRUD implements IDataAccess{
    @Override
    public void save(Pet pet) {

    }

    @Override
    public void findBy(SearchFilter filter) {
        findByTwoFilters(filter, null);
    }

    @Override
    public void findByTwoFilters(SearchFilter filter, SearchFilter secondFilter) {

    }

    @Override
    public void edit(Integer number) {

    }

    @Override
    public void delete(Integer number) {

    }
}
