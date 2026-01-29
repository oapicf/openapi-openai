/*
 * CreateCompletionResponse.h
 *
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */

#ifndef _CreateCompletionResponse_H_
#define _CreateCompletionResponse_H_


#include <string>
#include "CompletionUsage.h"
#include "CreateCompletionResponse_choices_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionResponse();
	CreateCompletionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A unique identifier for the completion.
	 */
	std::string getId();

	/*! \brief Set A unique identifier for the completion.
	 */
	void setId(std::string  id);
	/*! \brief Get The list of completion choices the model generated for the input prompt.
	 */
	std::list<CreateCompletionResponse_choices_inner> getChoices();

	/*! \brief Set The list of completion choices the model generated for the input prompt.
	 */
	void setChoices(std::list <CreateCompletionResponse_choices_inner> choices);
	/*! \brief Get The Unix timestamp (in seconds) of when the completion was created.
	 */
	int getCreated();

	/*! \brief Set The Unix timestamp (in seconds) of when the completion was created.
	 */
	void setCreated(int  created);
	/*! \brief Get The model used for completion.
	 */
	std::string getModel();

	/*! \brief Set The model used for completion.
	 */
	void setModel(std::string  model);
	/*! \brief Get This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	 */
	std::string getSystemFingerprint();

	/*! \brief Set This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
	 */
	void setSystemFingerprint(std::string  system_fingerprint);
	/*! \brief Get The object type, which is always \"text_completion\"
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"text_completion\"
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	CompletionUsage getUsage();

	/*! \brief Set 
	 */
	void setUsage(CompletionUsage  usage);

private:
	std::string id;
	std::list <CreateCompletionResponse_choices_inner>choices;
	int created;
	std::string model;
	std::string system_fingerprint;
	std::string object;
	CompletionUsage usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateCompletionResponse_H_ */
