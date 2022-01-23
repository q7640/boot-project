package mapper;

import entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Dong
 * @since 2022-01-21
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
