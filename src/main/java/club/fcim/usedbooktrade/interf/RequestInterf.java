package club.fcim.usedbooktrade.interf;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import club.fcim.usedbooktrade.dataformatutil.MapperFacadeFactory;
import club.fcim.usedbooktrade.dbutil.DBAssist;
import club.fcim.usedbooktrade.innerlogic.BookDetail;
import club.fcim.usedbooktrade.mybatis.client.UsedbookNotesMapper;
import club.fcim.usedbooktrade.mybatis.model.UsedbookNotes;

/**
 * 外来请求接口消息分发类
 * 
 * @author cris-li
 *
 */
@Controller
@RequestMapping(value = "/textbook")
public class RequestInterf {
	
	@Resource(name = "usedbook")
	private DBAssist dcr;

	@Autowired
	MapperFacadeFactory mapper;

	@RequestMapping("/add")
	public int add(BookDetail bookDetail) throws Exception{
		if(bookDetail.getName()==null){
			return 0;
		}
		if(bookDetail.getType()==null){
			return 0;
		}
		
		UsedbookNotes usedbooknotes = mapper.getObject().map(bookDetail, UsedbookNotes.class);
		UUID uuid = UUID.randomUUID();
		usedbooknotes.setId(uuid.toString());
		Date date = new Date();
		usedbooknotes.setUpdatetime(date);
		
		UsedbookNotesMapper usedbooknotesmapper = dcr.getMapper(UsedbookNotesMapper.class, true);
		usedbooknotesmapper.insert(usedbooknotes);
		dcr.closeSession(true);
		return 0;
		
	}

}
