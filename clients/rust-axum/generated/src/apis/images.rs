use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageEditResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageVariationResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}




/// Images
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Images<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Creates an image given a prompt..
    ///
    /// CreateImage - POST /v1/images/generations
    async fn create_image(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateImageRequest,
    ) -> Result<CreateImageResponse, E>;

    /// Creates an edited or extended image given an original image and a prompt..
    ///
    /// CreateImageEdit - POST /v1/images/edits
    async fn create_image_edit(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    body: Multipart,
    ) -> Result<CreateImageEditResponse, E>;

    /// Creates a variation of a given image..
    ///
    /// CreateImageVariation - POST /v1/images/variations
    async fn create_image_variation(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    body: Multipart,
    ) -> Result<CreateImageVariationResponse, E>;
}
