/*
 * AssistantFileObject.h
 *
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */

#ifndef _AssistantFileObject_H_
#define _AssistantFileObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 *
 *  \ingroup Models
 *
 */

class AssistantFileObject : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantFileObject();
	AssistantFileObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantFileObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `assistant.file`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `assistant.file`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the assistant file was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the assistant file was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The assistant ID that the file is attached to.
	 */
	std::string getAssistantId();

	/*! \brief Set The assistant ID that the file is attached to.
	 */
	void setAssistantId(std::string  assistant_id);

private:
	std::string id;
	std::string object;
	int created_at;
	std::string assistant_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantFileObject_H_ */
