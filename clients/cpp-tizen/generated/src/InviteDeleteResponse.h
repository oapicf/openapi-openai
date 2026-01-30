/*
 * InviteDeleteResponse.h
 *
 * 
 */

#ifndef _InviteDeleteResponse_H_
#define _InviteDeleteResponse_H_


#include <string>
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

class InviteDeleteResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteDeleteResponse();
	InviteDeleteResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteDeleteResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `organization.invite.deleted`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.invite.deleted`
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	bool getDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);

private:
	std::string object;
	std::string id;
	bool deleted;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteDeleteResponse_H_ */
