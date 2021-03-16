package generate;

import generate.User;

/**
 * @Entity generate.User
 */
public interface UserDao {
    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2021-03-16 20:50:43
     */
    int updateByPrimaryKey(User record);
}