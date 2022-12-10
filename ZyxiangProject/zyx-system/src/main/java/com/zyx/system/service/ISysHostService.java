package com.zyx.system.service;

import java.util.List;

import com.zyx.common.core.domain.entity.SysHost;

/**
 * 热点新闻表Service接口
 * 
 * @author 张银祥
 * @date 2021-05-29
 */
public interface ISysHostService 
{
    /**
     * 查询热点新闻表
     * 
     * @param hostId 热点新闻表ID
     * @return 热点新闻表
     */
    public SysHost selectSysHostById(Long hostId);

    /**
     * 查询热点新闻表列表
     * 
     * @param sysHost 热点新闻表
     * @return 热点新闻表集合
     */
    public List<SysHost> selectSysHostList(SysHost sysHost);

    /**
     * 新增热点新闻表
     * 
     * @param sysHost 热点新闻表
     * @return 结果
     */
    public int insertSysHost(SysHost sysHost);

    /**
     * 修改热点新闻表
     * 
     * @param sysHost 热点新闻表
     * @return 结果
     */
    public int updateSysHost(SysHost sysHost);

    /**
     * 批量删除热点新闻表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysHostByIds(String ids);

    /**
     * 删除热点新闻表信息
     * 
     * @param hostId 热点新闻表ID
     * @return 结果
     */
    public int deleteSysHostById(Long hostId);
}
