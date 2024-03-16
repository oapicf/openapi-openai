/*
 * CreateCompletionResponse_choices_inner.h
 *
 * 
 */

#ifndef _CreateCompletionResponse_choices_inner_H_
#define _CreateCompletionResponse_choices_inner_H_


#include <string>
#include "CreateCompletionResponse_choices_inner_logprobs.h"
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

class CreateCompletionResponse_choices_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionResponse_choices_inner();
	CreateCompletionResponse_choices_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionResponse_choices_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get 
	 */
	CreateCompletionResponse_choices_inner_logprobs getLogprobs();

	/*! \brief Set 
	 */
	void setLogprobs(CreateCompletionResponse_choices_inner_logprobs  logprobs);
	/*! \brief Get 
	 */
	std::string getFinishReason();

	/*! \brief Set 
	 */
	void setFinishReason(std::string  finish_reason);

private:
	std::string text;
	int index;
	CreateCompletionResponse_choices_inner_logprobs logprobs;
	std::string finish_reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateCompletionResponse_choices_inner_H_ */
