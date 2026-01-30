/*
 * InviteListResponse.h
 *
 * 
 */

#ifndef _InviteListResponse_H_
#define _InviteListResponse_H_


#include <string>
#include "Invite.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteListResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteListResponse();
	InviteListResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteListResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getHasMore();

	/*! \brief Set The `has_more` property is used for pagination to indicate there are additional results.
	 */
	void setHasMore(bool  has_more);

private:
	std::string object;
	std::list <Invite>data;
	std::string first_id;
	std::string last_id;
	bool has_more;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteListResponse_H_ */
