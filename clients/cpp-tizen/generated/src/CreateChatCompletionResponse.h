/*
 * CreateChatCompletionResponse.h
 *
 * 
 */

#ifndef _CreateChatCompletionResponse_H_
#define _CreateChatCompletionResponse_H_


#include <string>
#include "CreateChatCompletionResponse_choices_inner.h"
#include "CreateCompletionResponse_usage.h"
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

class CreateChatCompletionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionResponse();
	CreateChatCompletionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionResponse();

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
	std::list<CreateChatCompletionResponse_choices_inner> getChoices();

	/*! \brief Set 
	 */
	void setChoices(std::list <CreateChatCompletionResponse_choices_inner> choices);
	/*! \brief Get 
	 */
	CreateCompletionResponse_usage getUsage();

	/*! \brief Set 
	 */
	void setUsage(CreateCompletionResponse_usage  usage);

private:
	std::string id;
	std::string object;
	int created;
	std::string model;
	std::list <CreateChatCompletionResponse_choices_inner>choices;
	CreateCompletionResponse_usage usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionResponse_H_ */
