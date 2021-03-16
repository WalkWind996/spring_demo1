package generator;

import generate.User;

/**
 * @Entity generate.User
 */
public interface UserMapper {
    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    int updateByPrimaryKey(User record);
}