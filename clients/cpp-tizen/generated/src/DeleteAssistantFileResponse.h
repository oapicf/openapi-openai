/*
 * DeleteAssistantFileResponse.h
 *
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 */

#ifndef _DeleteAssistantFileResponse_H_
#define _DeleteAssistantFileResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 *
 *  \ingroup Models
 *
 */

class DeleteAssistantFileResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteAssistantFileResponse();
	DeleteAssistantFileResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteAssistantFileResponse();

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

#endif /* _DeleteAssistantFileResponse_H_ */
