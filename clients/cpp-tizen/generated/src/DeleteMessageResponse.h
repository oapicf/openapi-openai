/*
 * DeleteMessageResponse.h
 *
 * 
 */

#ifndef _DeleteMessageResponse_H_
#define _DeleteMessageResponse_H_


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

class DeleteMessageResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteMessageResponse();
	DeleteMessageResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteMessageResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);

private:
	std::string id;
	bool deleted;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteMessageResponse_H_ */
