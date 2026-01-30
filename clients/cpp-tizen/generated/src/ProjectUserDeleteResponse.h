/*
 * ProjectUserDeleteResponse.h
 *
 * 
 */

#ifndef _ProjectUserDeleteResponse_H_
#define _ProjectUserDeleteResponse_H_


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

class ProjectUserDeleteResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectUserDeleteResponse();
	ProjectUserDeleteResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectUserDeleteResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
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

#endif /* _ProjectUserDeleteResponse_H_ */
