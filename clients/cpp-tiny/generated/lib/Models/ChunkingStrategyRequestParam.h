
/*
 * ChunkingStrategyRequestParam.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */

#ifndef TINY_CPP_CLIENT_ChunkingStrategyRequestParam_H_
#define TINY_CPP_CLIENT_ChunkingStrategyRequestParam_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AutoChunkingStrategyRequestParam.h"
#include "StaticChunkingStrategy.h"
#include "StaticChunkingStrategyRequestParam.h"

namespace Tiny {


/*! \brief The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 *  \ingroup Models
 *
 */

class ChunkingStrategyRequestParam{
public:

    /*! \brief Constructor.
	 */
    ChunkingStrategyRequestParam();
    ChunkingStrategyRequestParam(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChunkingStrategyRequestParam();


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
	/*! \brief Get 
	 */
	StaticChunkingStrategy getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(StaticChunkingStrategy  r_static);


    private:
    std::string type{};
    StaticChunkingStrategy r_static;
};
}

#endif /* TINY_CPP_CLIENT_ChunkingStrategyRequestParam_H_ */
