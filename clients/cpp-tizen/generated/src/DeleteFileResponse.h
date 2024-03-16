/*
 * DeleteFileResponse.h
 *
 * 
 */

#ifndef _DeleteFileResponse_H_
#define _DeleteFileResponse_H_


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

class DeleteFileResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteFileResponse();
	DeleteFileResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteFileResponse();

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
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	bool getDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);

private:
	std::string id;
	std::string object;
	bool deleted;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteFileResponse_H_ */
