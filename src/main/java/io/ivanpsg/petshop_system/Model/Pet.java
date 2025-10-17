package io.ivanpsg.petshop_system.Model;

public record Pet(
        String name,
        String lastName,
        PetType type,
        PetGender gender,
        Address address,
        Float age,
        Float weight,
        String breed
) {
}
