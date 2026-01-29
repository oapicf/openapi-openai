/*
 * CreateCompletionResponse_choices_inner_logprobs.h
 *
 * 
 */

#ifndef _CreateCompletionResponse_choices_inner_logprobs_H_
#define _CreateCompletionResponse_choices_inner_logprobs_H_


#include <string>
#include <list>
#include <map>
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

class CreateCompletionResponse_choices_inner_logprobs : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionResponse_choices_inner_logprobs();
	CreateCompletionResponse_choices_inner_logprobs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionResponse_choices_inner_logprobs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<int> getTextOffset();

	/*! \brief Set 
	 */
	void setTextOffset(std::list <int> text_offset);
	/*! \brief Get 
	 */
	std::list<long long> getTokenLogprobs();

	/*! \brief Set 
	 */
	void setTokenLogprobs(std::list <long long> token_logprobs);
	/*! \brief Get 
	 */
	std::list<std::string> getTokens();

	/*! \brief Set 
	 */
	void setTokens(std::list <std::string> tokens);
	/*! \brief Get 
	 */
	std::list<std::map> getTopLogprobs();

	/*! \brief Set 
	 */
	void setTopLogprobs(std::list <std::map> top_logprobs);

private:
	std::list <int>text_offset;
	std::list <long long>token_logprobs;
	std::list <std::string>tokens;
	std::list <std::map>top_logprobs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateCompletionResponse_choices_inner_logprobs_H_ */
