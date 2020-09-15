package TbUserService;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hao.oauth2.server.mapper.TbUserMapper;
import com.hao.oauth2.server.domain.TbUser;
/**
 * @author     ：Wang Hao
 * @date       ：Created in 2020/9/15 11:54
 */
@Service
public class TbUserService extends ServiceImpl<TbUserMapper, TbUser> {

}
