/*
 * MessageObject.h
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 */

#ifndef _MessageObject_H_
#define _MessageObject_H_


#include <string>
#include "MessageObject_content_inner.h"
#include "MessageObject_incomplete_details.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a message within a [thread](/docs/api-reference/threads).
 *
 *  \ingroup Models
 *
 */

class MessageObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageObject();
	MessageObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageObject();

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
	/*! \brief Get The object type, which is always `thread.message`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.message`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the message was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the message was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The [thread](/docs/api-reference/threads) ID that this message belongs to.
	 */
	std::string getThreadId();

	/*! \brief Set The [thread](/docs/api-reference/threads) ID that this message belongs to.
	 */
	void setThreadId(std::string  thread_id);
	/*! \brief Get The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
	 */
	std::string getStatus();

	/*! \brief Set The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	MessageObject_incomplete_details getIncompleteDetails();

	/*! \brief Set 
	 */
	void setIncompleteDetails(MessageObject_incomplete_details  incomplete_details);
	/*! \brief Get The Unix timestamp (in seconds) for when the message was completed.
	 */
	int getCompletedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the message was completed.
	 */
	void setCompletedAt(int  completed_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the message was marked as incomplete.
	 */
	int getIncompleteAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the message was marked as incomplete.
	 */
	void setIncompleteAt(int  incomplete_at);
	/*! \brief Get The entity that produced the message. One of `user` or `assistant`.
	 */
	std::string getRole();

	/*! \brief Set The entity that produced the message. One of `user` or `assistant`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The content of the message in array of text and/or images.
	 */
	std::list<MessageObject_content_inner> getContent();

	/*! \brief Set The content of the message in array of text and/or images.
	 */
	void setContent(std::list <MessageObject_content_inner> content);
	/*! \brief Get If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
	 */
	std::string getAssistantId();

	/*! \brief Set If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
	 */
	void setAssistantId(std::string  assistant_id);
	/*! \brief Get The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
	 */
	std::string getRunId();

	/*! \brief Set The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
	 */
	void setRunId(std::string  run_id);
	/*! \brief Get A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	 */
	void setFileIds(std::list <std::string> file_ids);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::string id;
	std::string object;
	int created_at;
	std::string thread_id;
	std::string status;
	MessageObject_incomplete_details incomplete_details;
	int completed_at;
	int incomplete_at;
	std::string role;
	std::list <MessageObject_content_inner>content;
	std::string assistant_id;
	std::string run_id;
	std::list <std::string>file_ids;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageObject_H_ */
