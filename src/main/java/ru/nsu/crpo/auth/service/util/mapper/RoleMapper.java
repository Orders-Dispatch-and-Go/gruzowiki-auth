package ru.nsu.crpo.auth.service.util.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.nsu.crpo.auth.service.api.dto.role.RoleResponse;
import ru.nsu.crpo.auth.service.model.Role;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RoleMapper {

    RoleResponse toRoleResponse(Role role);
}
