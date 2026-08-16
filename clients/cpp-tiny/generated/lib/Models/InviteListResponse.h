
/*
 * InviteListResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteListResponse_H_
#define TINY_CPP_CLIENT_InviteListResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Invite.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteListResponse{
public:

    /*! \brief Constructor.
	 */
    InviteListResponse();
    InviteListResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteListResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `list`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `list`
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<Invite> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Invite> data);
	/*! \brief Get The first `invite_id` in the retrieved `list`
	 */
	std::string getFirstId();

	/*! \brief Set The first `invite_id` in the retrieved `list`
	 */
	void setFirstId(std::string  first_id);
	/*! \brief Get The last `invite_id` in the retrieved `list`
	 */
	std::string getLastId();

	/*! \brief Set The last `invite_id` in the retrieved `list`
	 */
	void setLastId(std::string  last_id);
	/*! \brief Get The `has_more` property is used for pagination to indicate there are additional results.
	 */
	bool isHasMore();

	/*! \brief Set The `has_more` property is used for pagination to indicate there are additional results.
	 */
	void setHasMore(bool  has_more);


    private:
    std::string object{};
    std::list<Invite> data;
    std::string first_id{};
    std::string last_id{};
    bool has_more{};
};
}

#endif /* TINY_CPP_CLIENT_InviteListResponse_H_ */
