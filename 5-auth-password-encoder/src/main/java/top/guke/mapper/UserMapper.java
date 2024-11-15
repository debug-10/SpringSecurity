package top.guke.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.guke.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guke
 * @since 2024-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
