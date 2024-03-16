/*
 * CreateChatCompletionStreamResponse.h
 *
 * 
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


/*! \brief 
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
	int getCreated();

	/*! \brief Set 
	 */
	void setCreated(int  created);
	/*! \brief Get 
	 */
	std::string getModel();

	/*! \brief Set 
	 */
	void setModel(std::string  model);
	/*! \brief Get 
	 */
	std::list<CreateChatCompletionStreamResponse_choices_inner> getChoices();

	/*! \brief Set 
	 */
	void setChoices(std::list <CreateChatCompletionStreamResponse_choices_inner> choices);

private:
	std::string id;
	std::string object;
	int created;
	std::string model;
	std::list <CreateChatCompletionStreamResponse_choices_inner>choices;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionStreamResponse_H_ */
