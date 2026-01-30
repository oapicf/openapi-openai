/*
 * CreateMessageRequest_attachments_inner.h
 *
 * 
 */

#ifndef _CreateMessageRequest_attachments_inner_H_
#define _CreateMessageRequest_attachments_inner_H_


#include <string>
#include "CreateMessageRequest_attachments_inner_tools_inner.h"
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

class CreateMessageRequest_attachments_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMessageRequest_attachments_inner();
	CreateMessageRequest_attachments_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMessageRequest_attachments_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the file to attach to the message.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the file to attach to the message.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get The tools to add this file to.
	 */
	std::list<CreateMessageRequest_attachments_inner_tools_inner> getTools();

	/*! \brief Set The tools to add this file to.
	 */
	void setTools(std::list <CreateMessageRequest_attachments_inner_tools_inner> tools);

private:
	std::string file_id;
	std::list <CreateMessageRequest_attachments_inner_tools_inner>tools;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMessageRequest_attachments_inner_H_ */
