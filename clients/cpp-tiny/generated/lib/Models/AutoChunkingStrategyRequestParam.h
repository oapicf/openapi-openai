
/*
 * AutoChunkingStrategyRequestParam.h
 *
 * The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AutoChunkingStrategyRequestParam_H_
#define TINY_CPP_CLIENT_AutoChunkingStrategyRequestParam_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 *
 *  \ingroup Models
 *
 */

class AutoChunkingStrategyRequestParam{
public:

    /*! \brief Constructor.
	 */
    AutoChunkingStrategyRequestParam();
    AutoChunkingStrategyRequestParam(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AutoChunkingStrategyRequestParam();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `auto`.
	 */
	std::string getType();

	/*! \brief Set Always `auto`.
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_AutoChunkingStrategyRequestParam_H_ */
