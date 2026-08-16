
/*
 * VectorStoreExpirationAfter.h
 *
 * The expiration policy for a vector store.
 */

#ifndef TINY_CPP_CLIENT_VectorStoreExpirationAfter_H_
#define TINY_CPP_CLIENT_VectorStoreExpirationAfter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The expiration policy for a vector store.
 *
 *  \ingroup Models
 *
 */

class VectorStoreExpirationAfter{
public:

    /*! \brief Constructor.
	 */
    VectorStoreExpirationAfter();
    VectorStoreExpirationAfter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreExpirationAfter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
	 */
	std::string getAnchor();

	/*! \brief Set Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
	 */
	void setAnchor(std::string  anchor);
	/*! \brief Get The number of days after the anchor time that the vector store will expire.
	 */
	int getDays();

	/*! \brief Set The number of days after the anchor time that the vector store will expire.
	 */
	void setDays(int  days);


    private:
    std::string anchor{};
    int days{};
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreExpirationAfter_H_ */
