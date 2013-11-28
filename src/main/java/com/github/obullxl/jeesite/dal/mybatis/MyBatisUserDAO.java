/**
 * obullxl@gmail.com
 */
package com.github.obullxl.jeesite.dal.mybatis;
 * @author obullxl@gmail.com
 */
	 *  Query DB table <tt>atom_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from atom_user</tt>
	 *
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long count() throws DataAccessException {

	    Long retObj = (Long) this.getSqlSession().selectOne("ATOM-USER.count", null);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }	
	 *  Query DB table <tt>atom_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from atom_user where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return UserDO
	 *	@throws DataAccessException
	 */	 
    public UserDO find(long id) throws DataAccessException {
        Long param = new Long(id);

        return this.getSqlSession().selectOne("ATOM-USER.find", param);

    }	
	 *  Query DB table <tt>atom_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from atom_user</tt>
	 *
	 *	@return List<UserDO>
	 *	@throws DataAccessException
	 */	 
    public List<UserDO> findAll() throws DataAccessException {

        return this.getSqlSession().selectList("ATOM-USER.findAll", null);

    }	
	 *  Query DB table <tt>atom_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select uname from atom_user</tt>
	 *
	 *	@return List<String>
	 *	@throws DataAccessException
	 */	 
    public List<String> findName() throws DataAccessException {

        return this.getSqlSession().selectList("ATOM-USER.findName", null);

    }	
	 *  Delete records from DB table <tt>atom_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from atom_user where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int delete(long id) throws DataAccessException {
        Long param = new Long(id);

        return this.getSqlSession().delete("ATOM-USER.delete", param);
    }