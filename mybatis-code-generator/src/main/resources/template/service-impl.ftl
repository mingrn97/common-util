package ${basePackage}.service.impl;

import ${basePackage}.mapper.${domainNameUpperCamel}Mapper;
import ${basePackage}.domain.${domainNameUpperCamel};
import ${basePackage}.service.${domainNameUpperCamel}Service;
import ${basePackage}.dto.${domainNameUpperCamel}DTO;
import com.uhope.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.${pkDataType};

import javax.annotation.Resource;

/**
 * ${description}-ServiceImpl接口实现类
 * @author ${author} on ${date}
 */
@Service
@Transactional
public class ${domainNameUpperCamel}ServiceImpl extends AbstractService<${domainNameUpperCamel}, ${domainNameUpperCamel}DTO, ${pkDataType}> implements ${domainNameUpperCamel}Service {
    @Resource
    private ${domainNameUpperCamel}Mapper ${domainNameLowerCamel}Mapper;

}