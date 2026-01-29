/*
 * CreateChatCompletionStreamResponse.h
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */

#ifndef _CreateChatCompletionStreamResponse_H_
#define _CreateChatCompletionStreamResponse_H_


#include <string>
#include "CreateChatCompletionStreamResponse_choices_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionStreamResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionStreamResponse();
	CreateChatCompletionStreamResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionStreamResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A unique identifier for the chat completion. Each chunk has the same ID.
	 */
	std::string getId();

	/*! \brief Set A unique identifier for the chat completion. Each chunk has the same ID.
	 */
	void setId(std::string  id);
	/*! \brief Get A list of chat completion choices. Can be more than one if `n` is greater than 1.
	 */
	std::list<CreateChatCompletionStreamResponse_choices_inner> getChoices();

	/*! \brief Set A list of chat completion choices. Can be more than one if `n` is greater than 1.
	 */
	void setChoices(std::list <CreateChatCompletionStreamResponse_choices_inner> choices);
	/*! \brief Get The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
	 */
	int getCreated();

	/*! \brief Set The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
	 */
	void setCreated(int  created);
	/*! \brief Get The model to generate the completion.
	 */
	std::string getModel();

	/*! \brief Set The model to generate the completion.
	 */
	void setModel(std::string  model);
	/*! \brief Get This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	 */
	std::string getSystemFingerprint();

	/*! \brief Set This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	 */
	void setSystemFingerprint(std::string  system_fingerprint);
	/*! \brief Get The object type, which is always `chat.completion.chunk`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `chat.completion.chunk`.
	 */
	void setObject(std::string  object);

private:
	std::string id;
	std::list <CreateChatCompletionStreamResponse_choices_inner>choices;
	int created;
	std::string model;
	std::string system_fingerprint;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionStreamResponse_H_ */
