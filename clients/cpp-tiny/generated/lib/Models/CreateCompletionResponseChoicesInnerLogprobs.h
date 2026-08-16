
/*
 * CreateCompletionResponse_choices_inner_logprobs.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateCompletionResponse_choices_inner_logprobs_H_
#define TINY_CPP_CLIENT_CreateCompletionResponse_choices_inner_logprobs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionResponse_choices_inner_logprobs{
public:

    /*! \brief Constructor.
	 */
    CreateCompletionResponse_choices_inner_logprobs();
    CreateCompletionResponse_choices_inner_logprobs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateCompletionResponse_choices_inner_logprobs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<int> getTextOffset();

	/*! \brief Set 
	 */
	void setTextOffset(std::list <int> text_offset);
	/*! \brief Get 
	 */
	std::list<long> getTokenLogprobs();

	/*! \brief Set 
	 */
	void setTokenLogprobs(std::list <long> token_logprobs);
	/*! \brief Get 
	 */
	std::list<std::string> getTokens();

	/*! \brief Set 
	 */
	void setTokens(std::list <std::string> tokens);
	/*! \brief Get 
	 */
	std::list<Map> getTopLogprobs();

	/*! \brief Set 
	 */
	void setTopLogprobs(std::list <Map> top_logprobs);


    private:
    std::list<int> text_offset;
    std::list<long> token_logprobs;
    std::list<std::string> tokens;
    std::list<Map> top_logprobs;
};
}

#endif /* TINY_CPP_CLIENT_CreateCompletionResponse_choices_inner_logprobs_H_ */
